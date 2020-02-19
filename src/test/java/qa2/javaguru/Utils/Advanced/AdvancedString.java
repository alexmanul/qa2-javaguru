package qa2.javaguru.Utils.Advanced;

import qa2.javaguru.Utils.TestDataReader;

public class AdvancedString {

    private final String string;

    public AdvancedString(String string) {
        this.string = string;
    }

    public String toString() {
        return new TestDataReader().getDataFromFile(this.string);
    }

}
