package me.ericksantana.jda;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class JDA {

    public static void main(String[] args) throws LoginException {

        net.dv8tion.jda.api.JDA jda = JDABuilder.create("ODc3MjU4OTE3ODI5Mjk2MTI4.YRwBCA.LyZKmiI_Lx7NeRlXVTEpq0Fpqhw",
                GatewayIntent.GUILD_MEMBERS).build();

    }

}
