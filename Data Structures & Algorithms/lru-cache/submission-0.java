public class Node{
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key,int value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }
}


class LRUCache {

    Map<Integer,Node>map;
    Node head;
    Node tail;
    int cap;

    public LRUCache(int capacity) {
        
        this.cap=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public void insertNode(Node node){
        Node currafterhead=head.next;
        head.next=node;
        node.next=currafterhead;
        node.prev=head;
        currafterhead.prev=node;
    }
    public void deleteNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    public int get(int key) {

        if(!map.containsKey(key)){
            return -1;
        }
        
            Node dummy=map.get(key);
            deleteNode(dummy);
            insertNode(dummy);
        
        return dummy.value;
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            Node dummy=map.get(key);
            dummy.value=value;
            deleteNode(dummy);
            insertNode(dummy);
        }
        else{
        if(cap==map.size()){
            
            Node last=tail.prev;
            
            deleteNode(last);
            map.remove(last.key);
        }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            insertNode(newNode);

        }
                
    }
}
