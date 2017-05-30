package net.came20.pitcommander.module.stacklight.listener;

import net.came20.pitcommander.module.stacklight.Stacklight;
import net.came20.pitcommander.moduleframework.announce.AnnounceTask;
import net.came20.pitcommander.moduleframework.announce.Announcement;


/**
 * Created by cameronearle on 5/7/17.
 */
public class TimeTickUpdateTask implements AnnounceTask {
    @Override
    public void onAnnounce(Announcement announcement) {
        boolean warn = (Boolean) announcement.getPayload().get("warnTime");
        if (warn) {
            Stacklight.getInstance().SL_amberBlink();
        } else {
            Stacklight.getInstance().SL_amberOff();
        }
    }
}
