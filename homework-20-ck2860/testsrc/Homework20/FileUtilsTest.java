package Homework20;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {
    @Test
    public void TestZero() throws Exception {
        FileUtils.copyFile("delete_me.txt", "delete_meTest.txt");
        File expected = new File("delete_meTest.txt");
        File actual = new File("delete_me.txt");
        assertEquals(expected.getTotalSpace(), actual.getTotalSpace());
    }

    @Test
    public void TestOne() throws Exception {
        FileUtils.clearDirectory("fileTests");
        File actual = new File("fileTests");
        assertEquals(true, actual.isDirectory());
        assertEquals(false, actual.isFile());
        assertEquals("C:\\Users\\Condy\\601Code\\homework-20-ck2860\\fileTests", actual.getAbsolutePath().toString());

    }
}