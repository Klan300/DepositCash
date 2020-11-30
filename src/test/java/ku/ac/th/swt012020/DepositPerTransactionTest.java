package ku.ac.th.swt012020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositPerTransactionTest {

    @Test
    void deposit_Less_Than_10000_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float depositCash = 5000.00f;

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.canDepositPerTransaction(depositCash);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_Equal_10000_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float depositCash = 30000.00f;

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.canDepositPerTransaction(depositCash);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_More_Than_10000_Result_Should_Be_False() {
        // Arrange
        boolean expectedResult = false;
        float depositCash = 35000.00f;

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.canDepositPerTransaction(depositCash);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

}
