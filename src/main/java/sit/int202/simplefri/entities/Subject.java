package sit.int202.simplefri.entities;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private String id;
    private String title;
    private double credit;
}
