package ku.ac.th.swt012020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositPerDayTest {

    @Test
    void deposit_Less_Than_Maximum_Per_Day_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float depositCash = 5000.00f;

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.canDepositPerDay(depositCash);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_Equal_Maximum_Per_Day_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float depositCash = 50000.00f;

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.canDepositPerDay(depositCash);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void deposit_More_Than_Maximum_Per_Day_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = false;
        float depositCash = 55000.00f;

        // Act
        Agent agent  = new Agent();
        boolean actualResult = agent.canDepositPerDay(depositCash);

        // Assert
        assertEquals(expectedResult,actualResult);

    }

}
