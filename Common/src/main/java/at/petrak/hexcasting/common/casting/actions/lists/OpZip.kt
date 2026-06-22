package at.petrak.hexcasting.common.casting.actions.lists

import at.petrak.hexcasting.api.casting.asActionResult
import at.petrak.hexcasting.api.casting.castables.ConstMediaAction
import at.petrak.hexcasting.api.casting.eval.CastingEnvironment
import at.petrak.hexcasting.api.casting.getList
import at.petrak.hexcasting.api.casting.iota.Iota
import at.petrak.hexcasting.api.casting.iota.ListIota

object OpZip : ConstMediaAction {
    override val argc = 2
    override fun execute(args: List<Iota>, env: CastingEnvironment): List<Iota> {
        return args.getList(0, argc).toList().zip(args.getList(1, argc).toList()).map { (l1, l2) -> ListIota(listOf(l1, l2)) }.asActionResult
    }
}
