package Services;

import lombok.extern.log4j.Log4j;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import static org.assertj.core.api.Assertions.assertThat;


@Log4j
public class SharedAPI {

    private final OkHttpClient client = new OkHttpClient();

    public JSONArray makeRequest(String method, HttpUrl url, String authorization, RequestBody body, int responseCode) throws Exception {
        Request.Builder request = new Request.Builder();
        Response response;
        request.header("Content-Type", "application/json");
        if (authorization != null && !authorization.isEmpty()) {
            request.header("Authorization", authorization);
        }
        switch (method) {
            case "GET":
                request.url(url);
                break;
            case "DELETE":
                request.url(url).delete();
                break;
            case "POST":
                request.url(url).post(body);
                break;
            default:
                throw new Exception("REST method " + method + " is not defined");
        }
        response = client.newCall(request.build()).execute();
        String result = response.body().string().trim();

        log.info("Request URL: " + url);
        log.info("Response code is: " + response.code());
        log.info(method + " method request " + result);
        assertThat(response.code()).as("Response code is wrong").isEqualTo(responseCode);

        return getJSONResult(result);
    }

    private JSONArray getJSONResult(String result) {
        JSONArray json = new JSONArray();
        if (result.contains("<?xml") || result.contains("xmlns:i")) {
            json.put(XML.toJSONObject(result));
        } else if (result.isEmpty()) {
            json.put(new JSONObject("{}"));
        } else if (result.startsWith("{")) {
            json.put(new JSONObject(result));
        } else if (result.startsWith("[")) {
            json = new JSONArray(result);
        }
        log.debug("JSON array count " + json.length());
        return json;
    }
}
