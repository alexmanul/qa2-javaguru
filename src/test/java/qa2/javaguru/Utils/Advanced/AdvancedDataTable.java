package qa2.javaguru.Utils.Advanced;

import cucumber.api.DataTable;
import cucumber.runtime.table.TableConverter;
import gherkin.formatter.model.DataTableRow;

import java.util.List;

public class AdvancedDataTable extends DataTable {

    public AdvancedDataTable(List<DataTableRow> gherkinRows, TableConverter tableConverter) {
        super(gherkinRows, tableConverter);
    }

}
