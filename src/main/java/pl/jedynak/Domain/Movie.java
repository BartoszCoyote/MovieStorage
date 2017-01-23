package pl.jedynak.Domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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

    @NotNull
    @Column(name = "date", nullable = false)
    private int date;

    @NotEmpty
    @Column(name = "length", nullable = false)
    private String length;

    @NotNull
    @Column(name = "rate", nullable = false)
    private int rate;

    @NotEmpty
    @Column(name = "watch", nullable = false)
    private String watch;

    public Movie() {
        super();
    }

    public Movie(String name, String type, int date, String length, int rate, String watch) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.length = length;
        this.rate = rate;
        this.watch = watch;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getWatch() {
        return watch;
    }

    public void setWatch(String watch) {
        this.watch = watch;
    }
}
