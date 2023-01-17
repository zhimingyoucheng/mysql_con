package wjy.connection.model;

/**
 * @Author: blue.wjy@gmail.com
 * @Date: 2023/1/8 09:58
 */
public class Rmg {


    private String cst_id;
    private String cust_name;
    private String cert_type;
    private String cert_no;


    public Rmg() {
    }

    public Rmg(String cst_id, String cust_name, String cert_type, String cert_no) {
        this.cst_id = cst_id;
        this.cust_name = cust_name;
        this.cert_type = cert_type;
        this.cert_no = cert_no;
    }

    public String getCst_id() {
        return cst_id;
    }

    public void setCst_id(String cst_id) {
        this.cst_id = cst_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }
}
