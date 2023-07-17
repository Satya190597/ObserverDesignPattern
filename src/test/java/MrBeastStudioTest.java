import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MrBeastStudioTest {

    @Test
    public void testPublishPublicVideos() {
        MrBeastStudio studio = new MrBeastStudio();
        List<Boolean> result =  studio.publishPublicVideos();
        Assertions.assertEquals(4,result.size());
        result.forEach(Assertions::assertTrue);
    }

    @Test
    public void testGoldMembersOnly() {
        MrBeastStudio studio = new MrBeastStudio();
        List<Boolean> result =  studio.goldMembersOnly();
        Assertions.assertEquals(3,result.size());
        result.forEach(Assertions::assertTrue);
    }

    @Test
    public void testDiamondMembersOnly() {
        MrBeastStudio studio = new MrBeastStudio();
        List<Boolean> result =  studio.diamondMembersOnly();
        Assertions.assertEquals(2,result.size());
        result.forEach(Assertions::assertTrue);
    }
}
