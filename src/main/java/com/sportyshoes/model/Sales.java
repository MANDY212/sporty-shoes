package com.sportyshoes.model;

import java.sql.Date;

public class Sales {
    int id;
    int userid;
    int productid;
    Date date;
    public Sales(int id, int userid, int productid, Date date) {
        this.id = id;
        this.userid = userid;
        this.productid = productid;
        this.date = date;
    }

    
}
