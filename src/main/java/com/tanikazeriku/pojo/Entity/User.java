package com.tanikazeriku.pojo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private byte[] icon;
    private Integer trophies;
    private String enisDungeon;
    private String zweiDungeon;
    private String dreiDungeon;
}
