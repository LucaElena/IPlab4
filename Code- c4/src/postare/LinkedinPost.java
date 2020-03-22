package postare;

import java.util.List;

public class LinkedinPost implements Postare {
    private String  url ;
    private String text;
    private List<String> attachments;
    private  List <Pair<User,Reaction>> reactions;
    private List<Pair<User, Share>> share;
    private int impacts;

    public LinkedinPost(String url, String text, List<String> attachments, List<Pair<User, Reaction>> reactions, List<Pair<User, Share>> share, int impacts) {
        this.url = url;
        this.text = text;
        this.attachments = attachments;
        this.reactions = reactions;
        this.share = share;
        this.impacts = impacts;
    }

    public String getUrl() {
        return url;
    }

    public String getText() {
        return text;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public List<Pair<User, Reaction>> getReactions() {
        return reactions;
    }

    public List<Pair<User, Share>> getShare() {
        return share;
    }

    public int getImpacts() {
        return impacts;
    }

    @Override
    public List<Pair<User, Reaction>> getReaction() {
        return null;
    }

    @Override
    public List<Pair<User, Share>> getShares() {
        return null;
    }

    @Override
    public Integer Impact() {
        return null;
    }

    @Override
    public int ComentCount() {
        return 0;
    }
}
