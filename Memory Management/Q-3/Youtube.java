class VideoManage{
    int videoId, views, likes;
    String title;
    static int totalVideos;


    public void setVideoId(int videoId){
        this.videoId = videoId;
    }
    public int getVideoId(){
        return videoId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setViews(int views) {
        this.views = views;
    }
    public int getViews() {
        return views;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getLikes() {
        return likes;
    }

    public void setTotalVideos(int totalVideos) {
        VideoManage.totalVideos = totalVideos;
    }
    public static int getTotalVideos() {
        return totalVideos = 2;
    }



    void showVideoDetails(){
        System.out.println("Video Id is : " + videoId);
        System.out.println("Video title is : " + title);
        System.out.println("Video views : " + views);
        System.out.println("Likes of video : " + likes + "\n");
        
    }
}


public class Youtube {

    public static void main(String[] args) {
        VideoManage v1 = new VideoManage();
        

        v1.setVideoId(1);
        v1.setTitle("Kacha Badam");
        v1.setViews(1220202022);
        v1.setLikes(986325);
        v1.showVideoDetails();



        VideoManage v2 = new VideoManage();
        v2.setVideoId(2);
        v2.setTitle("Aaj ki raat");
        v2.setViews(562315879);
        v2.setLikes(4287301);
        v2.showVideoDetails();

        System.out.println("Total No. of Videos is :" + VideoManage.getTotalVideos());
        
    }
}