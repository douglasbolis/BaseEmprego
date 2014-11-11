package models;

import org.eclipse.persistence.annotations.UuidGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * Created by clayton on 29/10/14.
 */
@MappedSuperclass
public class Entity implements Serializable {
    @Id
    @UuidGenerator(name="UUID")
    @GeneratedValue(generator="UUID")
    @Column(name = "UUID")
    public String uuid;





    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date _created;

    public Date get_created() {
        return _created;
    }


    @Column(name = "UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date _updated;

    public Date get_updated() {
        return _updated;
    }


    @PrePersist
    public void prePersist() {
        this._created = this._updated = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        this._updated = new Date();
    }


}
