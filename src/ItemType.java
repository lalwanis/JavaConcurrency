/**
 * Created by lalwa_000 on 18/03/2016.
 */
 public  enum ItemType {
    COMPANY_WIDE("Company"),
    DEPARTMENTAL("Departmental"),
    PROJECT_SPECIFIC("Project");

    private String itemCode;

    private ItemType(String dbCode){ this.itemCode = dbCode; }

    public String getItemCode(){ return itemCode; }
}



