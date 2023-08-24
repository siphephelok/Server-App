package siphephelo.server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import siphephelo.server.enumeration.Status;

import static jakarta.persistence.GenerationType.AUTO;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column
    private String ipAddress;
    private String name;
    private  String memory;
    private  String type;
    private String imageUrl;
    private Status status;
}
