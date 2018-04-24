package cm.service;

import cm.model.ClaimRevision;
import cm.repository.ClaimRevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimRevisionManager {

    private final ClaimRevisionRepository claimRepo;

    @Autowired
    public ClaimRevisionManager(ClaimRevisionRepository claimRepo) {
        this.claimRepo = claimRepo;
    }

    public void doWork() {

        ClaimRevision claim = new ClaimRevision(5, "Mrs", "Anyanka Troop");
        claim = claimRepo.save(claim);

        Iterable<ClaimRevision> allResults = claimRepo.findAll();

        allResults.forEach(claimRes -> System.out.println(claimRes.toString()));
    }
}
