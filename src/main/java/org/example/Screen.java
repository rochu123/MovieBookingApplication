package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Screen {
    private String id;
    private List<Show> showList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addShow(Show show) {
        if (isNull(showList)) {
            showList = new ArrayList<>();
        }
        showList.add(show);
    }
}
