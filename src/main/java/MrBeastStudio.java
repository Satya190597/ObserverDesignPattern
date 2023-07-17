import Publisher.MrBeastYoutube;
import Subscriber.FamilyAndFriends;
import Subscriber.PatreonMembers;
import Subscriber.WebsiteMembers;
import Subscriber.YoutubeMembers;

import java.util.List;

public class MrBeastStudio {
    private static final String FAMILY_AND_FRIENDS = "FamilyAndFriends";
    private static final String PATREON_MEMBERS = "Patreon";
    private static final String YOUTUBE_MEMBERS = "YoutubeMembers";
    private static final String WEBSITE_MEMBERS = "WebsiteMembers";

    MrBeastStudio() {
        MrBeastYoutube.getInstance().subscribe(FAMILY_AND_FRIENDS, new FamilyAndFriends());
        MrBeastYoutube.getInstance().subscribe(PATREON_MEMBERS, new PatreonMembers());
        MrBeastYoutube.getInstance().subscribe(YOUTUBE_MEMBERS, new YoutubeMembers());
        MrBeastYoutube.getInstance().subscribe(WEBSITE_MEMBERS, new WebsiteMembers());
    }

    public List<Boolean> publishPublicVideos() {
        return MrBeastYoutube.getInstance().sendNotification(List.of(FAMILY_AND_FRIENDS, PATREON_MEMBERS, WEBSITE_MEMBERS, YOUTUBE_MEMBERS));
    }

    public List<Boolean> goldMembersOnly() {
        return MrBeastYoutube.getInstance().sendNotification(List.of(FAMILY_AND_FRIENDS, PATREON_MEMBERS, WEBSITE_MEMBERS));
    }

    public List<Boolean> diamondMembersOnly() {
        return MrBeastYoutube.getInstance().sendNotification(List.of(FAMILY_AND_FRIENDS, WEBSITE_MEMBERS));
    }
}
