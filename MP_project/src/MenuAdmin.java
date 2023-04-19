import java.util.Scanner;

public class MenuAdmin {



    // constructor
    public void MenuAdmin(User u){
        Scanner input = new Scanner(System.in);






    }

    private void deleteAdmin(User u){
        DeleteAdmin deleteadmin = new DeleteAdmin();
        deleteadmin.DeleteAdmin(u);
    }

    private void editCharacter(User u){
        EditCharacter editCharacter = new EditCharacter();
        editCharacter.EditCharacter(u);
    }

    private void validateChallenges(){
        ValidateChallenges validateChallenges = new ValidateChallenges();
        validateChallenges.ValidateChallenges();
    }
    private void addFeature(User u){
        AddFeature addFeature = new AddFeature();
        addFeature.AddFeature(u);
    }
    private void banUser(User u){
        UserManager userManager = new UserManager();
        userManager.UserManager();
    }

}
