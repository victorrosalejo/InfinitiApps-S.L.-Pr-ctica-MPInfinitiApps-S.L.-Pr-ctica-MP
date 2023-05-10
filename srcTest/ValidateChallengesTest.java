import org.junit.jupiter.api.Test;


public class ValidateChallengesTest {

    @Test
    public void testValidateChallenges() {
        User user1 = new User();
        user1.setName("Julio");
        user1.setNick("JulioPro23");
        user1.setPassword("123456");
        //User user2 = new User("Jane Doe", "67890");

        // Create a challenge for user1
    //    Challenge challenge1 = new Challenge(user1, user2, 10);

        // Create a challenge for user2
   //     Challenge challenge2 = new Challenge(user2, user1, 5);

        // Add the challenges to the database
        DatabaseManager databaseManager = new DatabaseManager();
      //  databaseManager.addChallenge(user1.getRegisterNumber(), challenge1);
     //   databaseManager.addChallenge(user2.getRegisterNumber(), challenge2);

        // Validate the challenges
     //   ValidateChallenges validator = new ValidateChallenges(user1);
     //   validator.validateChallenges();

        // Assert that the challenges are now validated
        //assertTrue(challenge1.isValid());
       // assertTrue(challenge2.isValid());
    }
}
