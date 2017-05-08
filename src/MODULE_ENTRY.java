import net.came20.pitcommander.module.stacklight.listener.ChecklistContainerUpdateTask;
import net.came20.pitcommander.module.stacklight.listener.FetchChecklistListener;
import net.came20.pitcommander.module.stacklight.listener.TimeTickUpdateTask;
import net.came20.pitcommander.moduleframework.Module;
import net.came20.pitcommander.moduleframework.command.Command;

/**
 * Created by cameronearle on 5/7/17.
 */
public class MODULE_ENTRY {
    static {
        new FetchChecklistListener().onReply(Module.getCommandTransmitter().sendCommand(new Command("FETCH_CHECKLIST", null))); //Make initial request

        Module.getAnnounceListener().addListener("ChecklistContainerUpdate", new ChecklistContainerUpdateTask()); //Bind announce listeners
        Module.getAnnounceListener().addListener("MatchContainerUpdate", new TimeTickUpdateTask());
    }
}
