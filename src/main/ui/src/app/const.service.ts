import { Injectable } from '@angular/core';

@Injectable()
export class ConstService {

  constructor() { }

  getCategories(): any[] {
    return categories;
  }

  getWilayas(): string[] {
    return wilayas;
  }

}

const wilayas = [
  'ADRAR',
  'AIN_DEFLA',
  'AIN_TEMOUCHENT',
  'AL_TARF',
  'ALGER',
  'ANNABA',
  'B.B.ARRERIDJ',
  'BATNA',
  'BECHAR',
  'BEJAIA',
  'BISKRA',
  'BLIDA',
  'BOUIRA',
  'BOUMERDES',
  'CHLEF',
  'CONSTANTINE',
  'DJELFA',
  'EL_BAYADH',
  'EL_OUED',
  'GHARDAIA',
  'GUELMA',
  'ILLIZI',
  'JIJEL',
  'KHENCHELA',
  'LAGHOUAT',
  'MASCARA',
  'MEDEA',
  'MILA',
  'MOSTAGANEM',
  'MSILA',
  'NAAMA',
  'ORAN',
  'OUARGLA',
  'OUM_ELBOUAGHI',
  'RELIZANE',
  'SAIDA',
  'SETIF',
  'SIDI_BEL_ABBES',
  'SKIKDA',
  'SOUKAHRAS',
  'TAMANGHASSET',
  'TEBESSA',
  'TIARET',
  'TINDOUF',
  'TIPAZA',
  'TISSEMSILT',
  'TIZI_OUZOU',
  'TLEMCEN'
]

const categories = [
  {
    "label": "Maison",
    "subCategories": [
      {
        "label": "Meubles",
        "name": "HOME_FURNITURE"
      },
      {
        "label": "Electroménager",
        "name": "HOME_APPLIANCE"
      },
      {
        "label": "Vêtements",
        "name": "CLOTHING"
      },
      {
        "label": "Bébés",
        "name": "BABY"
      },
      {
        "label": "Bijoux",
        "name": "JEWELRY"
      },
      {
        "label": "Décoration",
        "name": "DECORATION"
      }
    ]
  },
  {
    "label": "Multimédia",
    "subCategories": [
      {
        "label": "Informatique",
        "name": "COMPUTER"
      },
      {
        "label": "CD / DVD",
        "name": "CD_DVD"
      },
      {
        "label": "Téléphonie",
        "name": "PHONE"
      },
      {
        "label": "Image et son",
        "name": "IMAGE_SOUND"
      }
    ]
  },
  {
    "label": "Autres",
    "subCategories": [
      {
        "label": "Autres",
        "name": "OTHERS"
      }
    ]
  },
  {
    "label": "Véhicules",
    "subCategories": [
      {
        "label": "Voitures",
        "name": "CARS"
      },
      {
        "label": "Motos",
        "name": "MOTOS"
      },
      {
        "label": "Utilitaires",
        "name": "COMMERCIAL_VEHICULES"
      }
    ]
  },
  {
    "label": "Matériel Professionnel",
    "subCategories": [
      {
        "label": "Bureautique",
        "name": "OFFICE"
      },
      {
        "label": "Hotelerie / Restauration",
        "name": "HOTEL_RESTAURANT"
      },
      {
        "label": "BTP",
        "name": "BUILDING"
      },
      {
        "label": "Médical",
        "name": "HEALTH"
      },
      {
        "label": "Agricole",
        "name": "AGRICULTURAL"
      },
      {
        "label": "Industriel",
        "name": "INDUSTRY"
      }
    ]
  },
  {
    "label": "Immobilier",
    "subCategories": [
      {
        "label": "Ventes immobilières",
        "name": "IMMO_SALE"
      },
      {
        "label": "Location immobilière",
        "name": "IMMO_RENTAL"
      },
      {
        "label": "Locations de vacances",
        "name": "IMMO_VACANCY"
      }
    ]
  },
  {
    "label": "Loisirs",
    "subCategories": [
      {
        "label": "Sport",
        "name": "SPORTS"
      },
      {
        "label": "Instruments de musique",
        "name": "MUSIC_INSTRU"
      },
      {
        "label": "Livre",
        "name": "BOOK"
      },
      {
        "label": "Animaux",
        "name": "ANIMAL"
      }
    ]
  },
  {
    "label": "Emploi",
    "subCategories": [
      {
        "label": "Emploi",
        "name": "JOB"
      }
    ]
  }
];
