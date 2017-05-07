import net.came20.pitcommander.module.stacklight.listener.ChecklistContainerUpdateTask;
import net.came20.pitcommander.module.stacklight.listener.MatchContainerUpdateTask;
import net.came20.pitcommander.moduleframework.Module;
import net.came20.pitcommander.moduleframework.announce.AnnounceTask;
import net.came20.pitcommander.moduleframework.announce.Announcement;

/**
 * Created by cameronearle on 5/7/17.
 */
public class MODULE_ENTRY {
    static {
        Module.getAnnounceListener().addListener("ChecklistContainerUpdate", new ChecklistContainerUpdateTask());
        Module.getAnnounceListener().addListener("MatchContainerUpdate", new MatchContainerUpdateTask());
    }
}
