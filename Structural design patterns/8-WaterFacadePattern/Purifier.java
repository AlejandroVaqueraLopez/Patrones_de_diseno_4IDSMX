public class Purifier {
    private Water water;
    private Filter filter;
    private Bucket bucket;

    public Purifier(Water water, Filter filter, Bucket bucket) {
        this.water = water;
        this.filter = filter;
        this.bucket = bucket;
    }
    public void start(){
        bucket.fillBucket();
        water.badWater();
        bucket.clearBucket();
        filter.start();
        System.out.println("starting purification");
    }
    public void stop(){
        filter.stop();
        bucket.fillBucket();
        System.out.println("Stopping purification");
        water.goodWater();
    }
}
