import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	@Test
	public void testConstructor() {
		new LCA();
	}
	
	@Test
	public void TestlowCA() {
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(13);
        tree.root.left.right.left = new Node(14);
        tree.root.left.right.right = new Node(15);
        tree.root.left.left.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(9);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(10);
        tree.root.right.right.left = new Node(11);
        tree.root.right.right.left = new Node(12);
        final int expected = 4;
        final int result = tree.getLCA(6, 10).data;
        assertEquals("LCA of 6 and 10 is 4", result, expected);
	}
	
	@Test
	public void testInvalid() {
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(13);
        tree.root.left.right.left = new Node(14);
        tree.root.left.right.right = new Node(15);
        tree.root.left.left.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(9);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(10);
        tree.root.right.right.left = new Node(11);
        tree.root.right.right.left = new Node(12);
        final int expected = (Integer) null;
        final int result = tree.getLCA(6, 20).data;
        assertEquals("LCA of 6 and 20 is null", result, expected);
	}
	
	@Test
	public void testSame() {
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(13);
        tree.root.left.right.left = new Node(14);
        tree.root.left.right.right = new Node(15);
        tree.root.left.left.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(9);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(10);
        tree.root.right.right.left = new Node(11);
        tree.root.right.right.left = new Node(12);
        final int expected = 8;
        final int result = tree.getLCA(8, 8).data;
        assertEquals("LCA of 8 and 8 is 8", expected, result);
	}
	
	@Test
	public void testRoot() {
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(13);
        tree.root.left.right.left = new Node(14);
        tree.root.left.right.right = new Node(15);
        tree.root.left.left.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(9);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(10);
        tree.root.right.right.left = new Node(11);
        tree.root.right.right.left = new Node(12);
        final int expected = 1;
        final int result = tree.getLCA(1, 1).data;
        assertEquals("LCA of 1 and 1 is 1", result, expected);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
