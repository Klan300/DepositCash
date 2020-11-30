package ku.ac.th.swt012020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAccountTest {

    @Test
    void Is_Valid_Account_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        String Account = "123456789";

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.isValidAccount(Account);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void Is_Invalid_Account_Result_Should_Be_False() {
        // Arrange
        boolean expectedResult = false;
        String Account = "234567890";

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.isValidAccount(Account);

        // Assert
        assertEquals(expectedResult,actualResult);

    }
}
