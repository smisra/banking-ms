package com.ultimatesoftware.banking.account.cmd.service.scheduling;

import com.ultimatesoftware.banking.account.cmd.domain.commands.TransactionCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;

public class FutureCommandSend implements Runnable {
    private CommandGateway commandGateway;
    private TransactionCommand command;

    public FutureCommandSend(CommandGateway commandGateway, TransactionCommand command) {
        this.commandGateway = commandGateway;
        this.command = command;
    }

    @Override
    public void run() {
        commandGateway.send(command);
    }
}
