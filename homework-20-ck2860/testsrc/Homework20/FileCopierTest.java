package Homework20;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileCopierTest {
    @Test
    public void TestZero() throws Exception {
        FileUtils.copyFile("delete_me.txt", "delete_meTest.txt");
        File expected = new File("delete_meTest.txt");
        File actual = new File("delete_me.txt");
        assertEquals(expected.getTotalSpace(), actual.getTotalSpace());
    }
}