package pl.jedynak.Domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @NotEmpty
    @Column(name = "name", nullable = false)
    private String name;

    @NotEmpty
    @Column(name = "type", nullable = false)
    private String type;

    @NotEmpty
    @Column(name = "date", nullable = false)
    private Date date;

    @NotEmpty
    @Column(name = "length", nullable = false)
    private String length;

    @NotEmpty
    @Column(name = "rate", nullable = false)
    private Double rate;

//    @NotEmpty
//    @Column(name = "watch", nullable = false)
//    private Boolean watch;

    public Movie() {
        super();
    }

    public Movie(String name, String type, Date date, String length, Double rate) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.length = length;
        this.rate = rate;
        // this.watch = watch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

//    public Boolean getWatch() {
//        return watch;
//    }
//
//    public void setWatch(Boolean watch) {
//        this.watch = watch;
//    }
}
