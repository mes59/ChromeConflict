package engine.net.irc;

public enum IRCCommand
{
	RPL_TRACELINK(200),
	RPL_TRACECONNECTING(201),
	RPL_TRACEHANDSHAKE(202),
	RPL_TRACEUNKNOWN(203),
	RPL_TRACEOPERATOR(204),
	RPL_TRACEUSER(205),
	RPL_TRACESERVER(206),
	RPL_TRACENEWTYPE(208),
	RPL_TRACECLASS(209),
	RPL_STATSLINKINFO(211),
	RPL_STATSCOMMANDS(212),
	RPL_STATSCLINE(213),
	RPL_STATSNLINE(214),
	RPL_STATSILINE(215),
	RPL_STATSKLINE(216),
	RPL_STATSQLINE(217),
	RPL_STATSYLINE(218),
	RPL_ENDOFSTATS(219),
	RPL_UMODEIS(221),
	RPL_SERVICEINFO(231),
	RPL_ENDOFSERVICES(232),
	RPL_SERVICE(233),
	RPL_SERVLIST(234),
	RPL_SERVLISTEND(235),
	RPL_STATSLLINE(241),
	RPL_STATSUPTIME(242),
	RPL_STATSOLINE(243),
	RPL_STATSHLINE(244),
	RPL_LUSERCLIENT(251),
	RPL_LUSEROP(252),
	RPL_LUSERUNKNOWN(253),
	RPL_LUSERCHANNELS(254),
	RPL_LUSERME(255),
	RPL_ADMINME(256),
	RPL_ADMINLOC1(257),
	RPL_ADMINLOC2(258),
	RPL_ADMINEMAIL(259),
	RPL_TRACELOG(261),
	
	RPL_UNAWAY(305),
	RPL_NOWAWAY(306),
	RPL_WHOISUSER(311),
	RPL_WHOISSERVER(312),
	RPL_WHOISOPERATOR(313),
	RPL_WHOWASUSER(314),
	RPL_ENDOFWHO(315),
	RPL_WHOISCHANOP(316),
	RPL_WHOISIDLE(317),
	RPL_ENDOFWHOIS(318),
	RPL_WHOISCHANNELS(319),
	RPL_LISTSTART(321),
	RPL_LIST(322),
	RPL_LISTEND(323),
	RPL_CHANNELMODEIS(324),
	RPL_NOTOPIC(331),
	RPL_TOPIC(332),
	RPL_INVITING(341),
	RPL_SUMMONING(342),
	RPL_VERSION(351),
	RPL_WHOREPLY(352),
	RPL_NAMEREPLY(353),
	RPL_KILLDONE(361),
	RPL_CLOSING(362),
	RPL_CLOSEEND(363),
	RPL_LINKS(364),
	RPL_ENDOFLINKS(365),
	RPL_ENDOFNAMES(366),
	RPL_BANLIST(367),
	RPL_ENDOFBANLIST(368),
	RPL_ENDOFWHOWAS(369),
	RPL_INFO(371),
	RPL_MOTD(372),
	RPL_INFOSTART(373),
	RPL_ENDOFINFO(374),
	RPL_MOTDSTART(375),
	RPL_YOUREOPER(381),
	RPL_REHASHING(382),
	RPL_MYPORTIS(384),
	RPL_TIME(391),
	RPL_USERSSTART(392),
	RPL_USERS(393),
	RPL_ENDOFUSERS(394),
	RPL_NOUSERS(395);
	
	public final int id;
	
	private IRCCommand(int id)
	{
		this.id = id;
	}
	
	public static IRCCommand get(int id)
	{
		for (IRCCommand curr : values())
		{
			if (curr.id == id) return curr;
		}
		return null;
	}
}