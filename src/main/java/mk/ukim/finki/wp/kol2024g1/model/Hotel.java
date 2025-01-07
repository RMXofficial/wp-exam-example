package mk.ukim.finki.wp.kol2024g1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Hotel {

    private Long id;

    private String name;

    public Hotel(String name) {
        this.name = name;
    }
}
