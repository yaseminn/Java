/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author asus
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Trie {
  private TrieNode root;
  
  public Trie() {
    root = new TrieNode('#');
  }
  
  public void add(String s) {
    char chars[] = s.toCharArray();
    TrieNode currentNode = root;
    for (char c : chars) {
      TrieNode childNode = currentNode.getChild(c);
      if (childNode == null) {
        childNode = new TrieNode(c);
        currentNode.addNode(childNode);
      }
      currentNode = childNode;
    }
    // Set the actual data to last node.
    currentNode.setData(s);
  }
  
  public List<String> getAllWithPrefix(String prefix) {
    List<String> results = new ArrayList<>();
    TrieNode startNode = findNodeForPrefix(prefix);
    // Check if trie contains anything with the given prefix. If not return the empty array.
    if (startNode == null) {
      return results;
    }
    walkAndCollect(startNode, results);
    return results;
  }
  
  private TrieNode findNodeForPrefix(String s) {
    TrieNode currentNode = root;
    for(int i = 0; i < s.length(); i++) {
      TrieNode nextNode = currentNode.getChild(s.charAt(i));
      // If nextNode is null, this means this trie does not contain anything that has s as prefix.
      if(nextNode == null) {
        return null; 
      }
      currentNode = nextNode;
    }
    return currentNode;
  }
  
  private void walkAndCollect(TrieNode n, List<String> results) {
    // If there is data on the node, add it to the result
    if (n.data != null) {
      results.add(n.data);
    }
    // Leaf node, return.
    if (!n.hasChildren()) {
      return;
    }
    for (TrieNode child : n.getAllChildren()) {
      walkAndCollect(child, results);
    }
  }

// Very simple TrieNode class.
class TrieNode {
  char c;
  String data;
  HashMap<Character, TrieNode> children = null;
  
  public TrieNode(char c) {
    this.c = c;
    children = new HashMap<>();
  }
  
  public void setData(String s) {
    this.data = s;    
  }

  public void addNode(TrieNode child) {
    children.put(child.c , child);
  }

  public TrieNode getChild(char c) {
    return children.get(c);
  }
  
  public boolean hasChildren() {
    return children.size() > 0; 
  }
  
  public Collection<TrieNode> getAllChildren() {
     return children.values();
  }
  
  @Override
  public String toString() {
    return "Char: " + c + " Data: " + data; 
  }
 }

  
  // Test if it works..
  public static void main(String[] args) {
    Trie t = new Trie();
    t.add("trick");
    t.add("truck");
    t.add("tricky");
    t.add("tree");
    t.add("top");
    
    // trick, tricky
    List<String> res = t.getAllWithPrefix("tri");
    System.out.println(Arrays.toString(res.toArray()));
    // trick, tricky, truck, tree
    res = t.getAllWithPrefix("tr");
    System.out.println(Arrays.toString(res.toArray()));
    // All of them
    res = t.getAllWithPrefix("t");
    System.out.println(Arrays.toString(res.toArray()));
    // This one should return empty.
    res = t.getAllWithPrefix("tu");
    System.out.println(Arrays.toString(res.toArray()));
    
  }
}
