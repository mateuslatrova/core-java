public class MacBookPro extends MacBook {
    
    @Override
    public void start() {
        System.out.println("Inside MacBookPro's start()");
    }
    
    @Override
    public void shutdown() {
        System.out.println("Inside MacBookPro's shutdown()");
    }
}
