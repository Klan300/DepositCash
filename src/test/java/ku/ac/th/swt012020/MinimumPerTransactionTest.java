package ku.ac.th.swt012020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumPerTransactionTest {

    @Test
    void Deposit_More_Than_Minimum_Of_Account_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float deposit = 5000f;
        String account = "cash";

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.overMinimumPerTransaction(account,deposit);

        // Assert
        assertEquals(expectedResult,actualResult);

    }
    @Test
    void Deposit_Equal_Minimum_Of_Account_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float deposit = 100.00f;
        String account = "cash";

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.overMinimumPerTransaction(account,deposit);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void Deposit_Less_Than_Minimum_Of_Account_Result_Should_Be_False() {
        // Arrange
        boolean expectedResult = false;
        float deposit = 10.00f;
        String account = "cash";

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.overMinimumPerTransaction(account,deposit);

        // Assert
        assertEquals(expectedResult,actualResult);

    }
}
