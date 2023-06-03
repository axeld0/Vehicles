package Model.Classes;

import java.util.HashSet;

public class BranchCollection {

    private Branch[] BranchSet;


    public BranchCollection()
    {
        BranchSet = new Branch[3];
        BranchSet[0]   = new Branch("Mar del Plata", "Mexico 1483", 6789087);
        BranchSet [1] =new Branch("Necochea", "73 1234", 34598976);
        BranchSet[2]  = new Branch("Brandsen", "Avenida Pescados 123", 1232131);


    }

    public Branch getBranch(String selectedBranch)
    {
        Branch selected = new Branch();
        switch (selectedBranch)
        {
            case "Mar del Plata":
                selected = BranchSet[0];
                break;
            case "Necochea" :
                selected = BranchSet[1];
                break;
            case "Brandsen" :
                selected = BranchSet[2];
                break;
            default:
                throw new IllegalArgumentException("Wrong.");

        }
        return selected;
    }
}
