package com.example.submissiondicoding

object LegendsData {
    private val legendsNames = arrayOf(
            "Bangalore",
            "Bloodhound",
            "Caustic",
            "Crypto",
            "Fuse",
            "Gibraltar",
            "Horizon",
            "Lifeline",
            "Loba",
            "Mirage",
            "Octane",
            "Pathfinder",
            "Rampart",
            "Revenant",
            "Valkryie",
            "Wattson",
            "Wraith"
    )

    private val legendsDetails = arrayOf(
        "Bangalore is an Offensive Legend great with any playstlye. Her Smoke Launcher is great at breaking line-of-sight by deploying a smokescreen that can be used to retreat or double-down on an attack. Her passive Double Time gives her a speed boost when shot at while her ultimate, Rolling Thunder provides her with area denial capabilities.",
        "Bloodhound is a fast-paced Recon Legend great at pushing the enemy in their base. Their Tracker can be used to find where enemies have gone, and Eye of the Allfather will reveal hidden enemies and traps. Lastly, Beast of the Hunt causes Bloodhound to gain speed and highlights their enemies.",
        "Caustic is a Defensive Legend with a slower playstyle, as he excels in holding a position and breaking down enemy attacks. His Nox Gas Traps and Nox Gas Grenades damage and slow enemies while highlighting them for him with his Nox Vision, giving him and his squad opportunities to wipe them out in the ensuing chaos.",
        "A Recon Legend, Crypto takes to the skies with his Surveillance Drone, revealing enemies for Crypto and his squad using Neurolink. If he finds that the enemies have already hunkered down, he can activate his Drone EMP to break their defenses and slow them before he comes out of the shadows and makes his move with his squad.",
        "Fuse is an Offensive Legend who specializes in explosives. His Knuckle Cluster slows and damages the enemy, making it good for pushing, while his Grenadier passive ability allows him to hold 2 grenades per inventory slot and throw them farther, faster, and more accurately, all thanks to his mechanical arm. His ultimate, The Motherlode, creates a ring of fire around his enemies.",
        "Gibraltar is a Defensive Legend able to endure a lot of damage. His abilities allow him to take the brunt of enemy attacks with his Gun Shield and protect the squad with his Dome of Protection, this coupled with Defensive Bombardment allows him to do damage to enemies while giving his squad time to rest up and heal.",
        "Horizon is an Offensive Legend who is useful for directing her teammates or enemies toward a certain location. Her Gravity Lift tactical can be used to help herself and her squad reach higher places, while her Spacewalk passive allows her to start moving earlier after a long fall and turn faster midair, and her Black Hole ultimate can cause nearby enemies to be pulled toward its center.",
        "A Support Legend with healing abilities, Lifeline is a Legend best for keeping her team alive and up in a firefight. Her D.O.C. Heal Drone is great for keeping allies alive or quickly healing them after a fight. Her Combat Revive passive allows her drone to revive teammates while she does her own thing, this also allows her to open the extra compartment in blue supply bins. Lastly, when her ultimate is ready, she can call in helpful Gear with her Care Package.",
        "A Support Legend specializing in providing the squad with the highest quality loot, she can use her passive Eye for Quality to immediately see high-quality loot and ping it too for her teammates while her ultimate Black Market Boutique allows her squad to quickly see all the loot in the area and retrieve them from a safe place. Her tactical,  Burglar's Best Friend gives her a jump drive that she can use to teleport to higher places or through obstacles.",
        "Mirage is an Offensive Legend with abilities that let players distract and confuse enemies. His abilities are entirely based around decoys; his Tactical, Psyche Out, allows him to deploy a controllable decoy while his passive, Now You See Me... gives him time to escape after being knocked down by deploying a decoy while entering cloak and also enters cloak while reviving or using a Respawn Beacon. Finally, his ultimate Life of the Party deploys a team of decoys allowing him to summon moving decoys and escape or flank people unnoticed.",
        "Octane is a high-speed Offensive Legend as the name implies. His Stim is great for closing in on opponents and covering large distances. His passive Swift Mend and ultimate Launch Pad complements it by providing self-healing and a jump pad to cover more and vertical distances.",
        "Pathfinder is a Recon Legend very useful on movement and rotation. His Grappling Hook ability allows you to reach higher places and to tactically reposition while his Insider Knowledge and Zipline Gun abilities allow him to support your squad by letting them know the position of the next ring and provide a zipline on-the-fly to allow quick escapes and to reposition respectively.",
        "Rampart is a Defensive Legend that specializes in securing areas through firepower. Her Amped Cover allows her squad to deal increased damage to enemies from the safety of multiple heavily armored protective barriers, and her ultimate, the Emplaced Minigun \"Sheila\", forces enemies caught in front of it to make hasty decisions or risk being blown away by a storm of bullets. Modded Loader, her passive, makes LMGs and the Minigun even deadlier in this modder's hands.",
        "Revenant is an Offensive Legend who specializes in ambushes and pushing the enemy. His Passive, Stalker gives him the ability to climb higher and crouch walk faster, perfect for silently and quickly ambushing other squads. His Tactical, Silence, allows him to render the enemy’s Tactical and Ultimate abilities unusable, causing chaos and preventing any escape. Lastly, his Ultimate, Death Totem prevents him and his squad from being knocked down, perfect for defending an area or a risky tactic by him and his squad.",
        "Valkyrie is a Recon Legend who specializes in flight. Her passive, VTOL Jets allow her to fly for a few seconds but can only use Missile Swarm and while skydiving, she can mark enemies. Her tactical,  Missile Swarm can be good for dealing damage, especially while in her passive. Her ultimate,  Skyward Dive, can be used to skydive into a new area.",
        "A Defensive Legend with a slower playstyle, Wattson is great at defending chokepoints and small interior areas. Her Perimeter Security Fences not only slow but damage and reveal enemies who attempt to storm your location by passing through them. Her Passive, Spark of Genius, fully recharges her ultimate ability with any Ultimate Accelerant and also slowly regenerates her own shields. When it is ready, her ultimate, Interception Pylon will stop all grenades, missiles, or anything else throwable from breaking into your base and will also recharge your shields within a certain radius.",
        "A versatile Offensive Legend, Wraith can reposition and flank her enemies with her abilities. Using Into the Into the Void will allow Wraith to reposition or take cover while being invincible while her Dimensional Rift can allow her squad to be safely transported over long distances. Finally, her Voices from the Void passive can give her and her teammates' warnings about enemies approaching."
    )

    private val legendsImage = intArrayOf(
        R.drawable.bangalore,
        R.drawable.bloodhound,
        R.drawable.caustic,
        R.drawable.crypto,
        R.drawable.fuse,
        R.drawable.gibraltar,
        R.drawable.horizon,
        R.drawable.lifeline,
        R.drawable.loba,
        R.drawable.mirage,
        R.drawable.octane,
        R.drawable.pathfinder,
        R.drawable.rampart,
        R.drawable.revenant,
        R.drawable.valkyrie,
        R.drawable.wattson,
        R.drawable.wraith
    )

    val listData: ArrayList<Legends>
        get() {
            val list = arrayListOf<Legends>()
            for (position in legendsNames.indices){
                val legends = Legends()
                legends.name = legendsNames[position]
                legends.detail = legendsDetails[position]
                legends.photo = legendsImage[position]
                list.add(legends)
            }
            return list
        }
}