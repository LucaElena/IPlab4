package user;

public class InstagramUser implements User {
    private String name;
    private String category;
    private int shareCount;
    private  int likeCount;

    public InstagramUser(String name, String category, int shareCount, int likeCount) {
        this.name = name;
        this.category = category;
        this.shareCount = shareCount;
        this.likeCount = likeCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public int getLinkCount() {
        return 0;
    }

    @Override
    public int getShareCount() {
        return shareCount;
    }

    public int getLikeCount() {
        return likeCount;
    }
}
