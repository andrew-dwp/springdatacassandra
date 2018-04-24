package cm.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "claim_revision")
public class ClaimRevision {

    @PrimaryKey
    public int id;
    public String title;
    @Column(value = "full_name")
    public String fullName;
    @Column(value = "claim_master_id")
    public int claimMasterId = 1;

    public ClaimRevision(int id, String title, String fullName) {
        this.id = id;
        this.title = title;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getClaimMasterId() {
        return claimMasterId;
    }

    public void setClaimMasterId(int claimMasterId) {
        this.claimMasterId = claimMasterId;
    }

    @Override
    public String toString() {
        return "ClaimRevision "+"Id= "+this.id+" Title= "+this.title+" Full Name= "+this.fullName+" Claim Master Id= "+this.claimMasterId;
    }
}
