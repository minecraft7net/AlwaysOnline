package me.johnnywoof;

import me.johnnywoof.hybrid.AlwaysOnline;

import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public interface NativeExecutor {

	int runAsyncRepeating(Runnable runnable, long delay, long period, TimeUnit timeUnit);

	void cancelTask(int taskID);

	void cancelAllOurTasks();

	void unregisterAllListeners();

	void log(Level level, String message);

	Path dataFolder();

	void disablePlugin();

	void registerListener();

	AlwaysOnline getAOInstance();

}
