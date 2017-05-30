import net.came20.pitcommander.module.stacklight.Stacklight;
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
        Stacklight.getInstance(); //Invoke the GPIO controller to initialize pins
        new FetchChecklistListener().onReply(Module.getCommandTransmitter().sendCommand(new Command("FETCH_CHECKLIST_MATCH", null))); //Make initial request
        System.out.println("COMMAND COMPLETE");
        Module.getAnnounceListener().addListener("MatchChecklistContainerUpdate", new ChecklistContainerUpdateTask()); //Bind announce listeners
        Module.getAnnounceListener().addListener("TimeTick", new TimeTickUpdateTask());
    }
}
