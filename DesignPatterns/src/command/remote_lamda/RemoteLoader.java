package command.remote_lamda;

import command.remote_lamda.command.Command;
import command.remote_lamda.invoker.RemoteControl;
import command.remote_lamda.receiver.CeilingFan;
import command.remote_lamda.receiver.Light;
import command.remote_lamda.receiver.Sterio;

/**
 * client
 */
public class RemoteLoader {
    public static void main(String[] args) {
        /* invoker */
        RemoteControl remoteControl = new RemoteControl(); 

        /* receiver */
        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen light");
        CeilingFan livingRommCeilingFan = new CeilingFan("living room");
        Sterio sterio = new Sterio("living room");

        /* client is callig setCommand on invoker */
        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        /* livingRoomLight::on
         * LivingRoomLightOnCommand implements functional interface Command, overriding execute method 
         * and field Living livingRoomLight. on execute it will call on() on light
         */
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, livingRommCeilingFan::high, livingRommCeilingFan::off);

        Command setSterioWithCD = () -> {
            sterio.on();
            sterio.setCD();
            sterio.setVolume(11);
        };

        remoteControl.setCommand(3, setSterioWithCD, sterio::off);

        System.out.println(remoteControl);

        System.out.println();

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPresed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPresed(1);
        remoteControl.onButtonPressed(2);
        remoteControl.offButtonPresed(2);
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPresed(3);
        
    }
}
