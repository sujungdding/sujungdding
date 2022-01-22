package com.example.sujungdding.food;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

public class FoodZzimInsertRequest extends StringRequest {
    //서버 URL 설정(php 파일 연동)
    final static private String URL = "http://192.168.219.102/foodZzimInsertRequest.php";
    private Map<String, String> map;

    public FoodZzimInsertRequest(String userId, String fpostNo, Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("userId", userId);
        map.put("fpost_no", fpostNo);
    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}