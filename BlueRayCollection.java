public class BlueRayCollection {
    private static Node head = null;
    public void add(String title, String director, int yearsOfRelease, double cost) {
        Node temp = new Node();
        BlueRayDisk blueRayDisk = new BlueRayDisk(title, director, yearsOfRelease, cost);
        temp.disk = blueRayDisk;
        if (head == null) {
            head=temp;
        }
        else {
            Node current = head;
            while(current.nextDisk!=null) {
                current = current.nextDisk;
            }
            current.nextDisk = temp;
        }
    }
    public void show_all() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.disk.toString());
            temp=temp.nextDisk;
        }
    }
}
