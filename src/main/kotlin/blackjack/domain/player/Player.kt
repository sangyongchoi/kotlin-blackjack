package blackjack.domain.player

class Player(
    val player: Participant,
    val betAmount: Double,
) : BlackjackFunction by player, RevenueFunction by player {

    fun isCardReceiveAble(): Boolean {
        return player.getCardSum() < DEADLINE
    }

    companion object {
        private const val DEADLINE = 21
    }
}
