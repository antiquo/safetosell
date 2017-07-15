package by.antiquo.safetosell.command;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private static final CommandHelper instance = new CommandHelper();

   /* private Map<CommandName, Command> commands = new HashMap<>();

    private CommandHelper() {
        commands.put(CommandName.LOGINATION, new Logination());
        commands.put(CommandName.CHANGE_LANGUAGE, new ChangeLanguage());
        commands.put(CommandName.ADD_NEW_ROOM, new AddNewRoom());
        commands.put(CommandName.ADD_NEW_ROOM_FORM, new AddNewRoomForm());
        commands.put(CommandName.SHOW_FREE_ROOMS, new GetFreeRooms());
        commands.put(CommandName.REGISTRATION, new Registration());
        commands.put(CommandName.REGISTRATION_FORM, new RegistrationForm());
        commands.put(CommandName.ADD_NEW_BUILDING, new AddNewBuilding());
        commands.put(CommandName.ADD_NEW_BUILDING_FORM, new AddNewBuildingForm());
        commands.put(CommandName.HOUSEKEEPER, new HouseKeeper());
        commands.put(CommandName.SEEKER, new Seeker());
        commands.put(CommandName.LOG_OUT, new LogOut());
        commands.put(CommandName.SHOW_USERS, new ShowUsers());
        commands.put(CommandName.BLOCK_USER, new BlockUser());
        commands.put(CommandName.BLOCK_USER_FORM, new BlockUserForm());
        commands.put(CommandName.UNBLOCK_USER, new UnblockUser());
        commands.put(CommandName.ADD_BOOKING, new AddBooking());
        commands.put(CommandName.ADD_BOOKING_FORM, new AddBookingForm());
        commands.put(CommandName.SHOW_BOOKINGS, new GetBookings());
        commands.put(CommandName.CANCEL_BOOKING, new CancelBooking());
        commands.put(CommandName.ADMIN_BUILDING_OPERATIONS, new AdminBuildingOperations());
        commands.put(CommandName.ADMIN_ROOM_OPERATIONS, new AdminRoomOperations());
        commands.put(CommandName.ADMIN_USER_OPERATIONS, new AdminUserOperations());
        commands.put(CommandName.ADMIN_BOOKING_OPERATIONS, new AdminBookingOperations());
        commands.put(CommandName.UNBLOCK_USER_FORM, new UnblockUserForm());
        commands.put(CommandName.DELETE_BUILDING, new DeleteBuilding());
        commands.put(CommandName.DELETE_BUILDING_FORM, new DeleteBuildingForm());
        commands.put(CommandName.SHOW_ALL_BUILDINGS, new GetBuildings());
        commands.put(CommandName.DELETE_ROOM, new DeleteRoom());
        commands.put(CommandName.DELETE_ROOM_FORM, new DeleteRoomForm());
        commands.put(CommandName.SHOW_BLOCKED_USERS, new ShowBlockedUsers());
        commands.put(CommandName.CANCEL_BOOKING_FORM, new Cancel_Booking_Form());
        commands.put(CommandName.SHOW_BUILDING_INFORMATION, new ShowBuildingInformation());
    }

    public Command getCommand(String name) {
        name = name.replace('-', '_');
        CommandName commandName = CommandName.valueOf(name.toUpperCase());
        Command command = commands.get(commandName);
        return command;
    }
*/
    public static CommandHelper getInstance() {
        return instance;
    }
}

