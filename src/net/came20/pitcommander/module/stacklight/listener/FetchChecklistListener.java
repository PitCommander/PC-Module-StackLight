package net.came20.pitcommander.module.stacklight.listener;

import com.google.gson.internal.LinkedTreeMap;
import net.came20.pitcommander.module.stacklight.Stacklight;
import net.came20.pitcommander.moduleframework.command.Reply;


/**
 * Created by cameronearle on 5/8/17.
 */
public class FetchChecklistListener {
    public void onReply(Reply r) {
        try {
            boolean allChecked = ((boolean) r.getPayload().get("allChecked"));
            boolean redTask = ((boolean) r.getPayload().get("redSwitchTask"));
            boolean blueTask = ((boolean) r.getPayload().get("blueSwitchTask"));
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
