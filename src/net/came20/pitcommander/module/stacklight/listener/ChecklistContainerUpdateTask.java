package net.came20.pitcommander.module.stacklight.listener;

import com.google.gson.internal.LinkedTreeMap;
import net.came20.pitcommander.module.stacklight.Stacklight;
import net.came20.pitcommander.moduleframework.announce.AnnounceTask;
import net.came20.pitcommander.moduleframework.announce.Announcement;

/**
 * Created by cameronearle on 5/7/17.
 */

public class ChecklistContainerUpdateTask implements AnnounceTask {
    @Override
    public void onAnnounce(Announcement announcement) {
        LinkedTreeMap<String, Object> payload = ((LinkedTreeMap) announcement.getPayload().get("container"));
        boolean allChecked = ((Boolean) payload.get("allChecked"));
        boolean redTask = ((Boolean) payload.get("redSwitchTask"));
        boolean blueTask = ((Boolean) payload.get("blueSwitchTask"));
        if (allChecked) {
            Stacklight.getInstance().SL_greenOn();
        } else {
            Stacklight.getInstance().SL_greenOff();
        }

        if (redTask) {
            Stacklight.getInstance().SL_redOn();
        } else {
            Stacklight.getInstance().SL_redOff();
        }

        if (blueTask) {
            Stacklight.getInstance().SL_blueOn();
        } else {
            Stacklight.getInstance().SL_blueOff();
        }
    }
}
