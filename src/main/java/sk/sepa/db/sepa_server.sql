--
-- PostgreSQL database cluster dump
--

-- Started on 2023-09-05 21:58:30

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:VjFhx9/YAtQEwqn+U0+CoA==$8dTqoD2nkk84jRmAGYkyABOkulP8/G0qPFQx3ZEUSFQ=:lDQLwhnj9ZilobXMeg4nIlPEJVPEextgJBhkeEhZx1Q=';

--
-- User Configurations
--








--
-- Databases
--

--
-- Database "template1" dump
--

\connect template1

--
-- PostgreSQL database dump
--

-- Dumped from database version 15.4
-- Dumped by pg_dump version 15.3

-- Started on 2023-09-05 21:58:30

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

-- Completed on 2023-09-05 21:58:30

--
-- PostgreSQL database dump complete
--

--
-- Database "postgres" dump
--

\connect postgres

--
-- PostgreSQL database dump
--

-- Dumped from database version 15.4
-- Dumped by pg_dump version 15.3

-- Started on 2023-09-05 21:58:30

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 3316 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


-- Completed on 2023-09-05 21:58:30

--
-- PostgreSQL database dump complete
--

--
-- Database "sepa_database" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 15.4
-- Dumped by pg_dump version 15.3

-- Started on 2023-09-05 21:58:30

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3369 (class 1262 OID 16406)
-- Name: sepa_database; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE sepa_database WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Croatian_Croatia.1250';


ALTER DATABASE sepa_database OWNER TO postgres;

\connect sepa_database

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 6 (class 2615 OID 16407)
-- Name: sepa_dev; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA sepa_dev;


ALTER SCHEMA sepa_dev OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 16444)
-- Name: banka; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.banka (
    id bigint NOT NULL,
    ime_banke character varying(80),
    vbdi_banke character varying(8),
    sts_banke boolean,
    date date,
    iznos_naknade numeric(100,2),
    vrsta_naknade bigint
);


ALTER TABLE sepa_dev.banka OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16466)
-- Name: grupa_naloga; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.grupa_naloga (
    id bigint NOT NULL,
    id_user bigint,
    iznos_grupe numeric(100,2),
    sts_grupe boolean,
    date date
);


ALTER TABLE sepa_dev.grupa_naloga OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16449)
-- Name: nalog; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.nalog (
    id bigint NOT NULL,
    id_grupe_naloga bigint,
    id_user bigint,
    id_banke bigint,
    tip_naloga character varying(40),
    valuta_placanja character varying(3),
    iznos numeric(100,2),
    ime_plat character varying(40),
    adresa_plat character varying(40),
    mjesto_plat character varying(40),
    ime_prim character varying(40),
    adresa_prim character varying(40),
    mjesto_prim character varying(40),
    sif_opis_plac integer,
    dat_izvrsenja date,
    dat_podnosenja date,
    drzava_plat character varying(2),
    kontrolni_broj_plat character varying(2),
    iban_plat character varying(40),
    model_plat character varying(40),
    pnb_plat character varying(40),
    drzava_prim character varying(2),
    kontrolni_broj_prim character varying(2),
    iban_prim character varying(40),
    model_prim character varying(40),
    pnb_prim character varying(40),
    opis_plac character varying(80),
    br_blagajne integer,
    vr_naknade integer,
    iznos_naknade numeric(100,2),
    sif_namjene character varying(5)
);


ALTER TABLE sepa_dev.nalog OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16415)
-- Name: racun; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.racun (
    id bigint NOT NULL,
    drzava_rac character varying(40),
    kontrolni_broj_rac character varying(2),
    iban_rac character varying(40),
    ime_rac character varying(40),
    adresa_rac character varying(40),
    mjesto_rac character varying(40),
    sts_rac boolean,
    date date,
    vbdi_rac character varying(8),
    id_banke bigint
);


ALTER TABLE sepa_dev.racun OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16408)
-- Name: users; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.users (
    id bigint NOT NULL,
    ime character varying(30),
    prezime character varying(30),
    email character varying(80),
    password character varying(80),
    dob integer,
    lokacija character varying(20),
    username character varying(20),
    roles character varying(50),
    br_blagajne bigint
);


ALTER TABLE sepa_dev.users OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16411)
-- Name: users_id_seq; Type: SEQUENCE; Schema: sepa_dev; Owner: postgres
--

CREATE SEQUENCE sepa_dev.users_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sepa_dev.users_id_seq OWNER TO postgres;

--
-- TOC entry 3370 (class 0 OID 0)
-- Dependencies: 216
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.users_id_seq OWNED BY sepa_dev.users.id;


--
-- TOC entry 221 (class 1259 OID 16511)
-- Name: vrsta_namjene; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.vrsta_namjene (
    id bigint,
    sif_namjene character varying(5),
    opis character varying(140),
    date date
);


ALTER TABLE sepa_dev.vrsta_namjene OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16514)
-- Name: vrsta_opisa_placanja; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.vrsta_opisa_placanja (
    id bigint,
    sif_opis_plac bigint,
    opis character varying(240),
    date date
);


ALTER TABLE sepa_dev.vrsta_opisa_placanja OWNER TO postgres;

--
-- TOC entry 3198 (class 2604 OID 16412)
-- Name: users id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.users ALTER COLUMN id SET DEFAULT nextval('sepa_dev.users_id_seq'::regclass);


--
-- TOC entry 3359 (class 0 OID 16444)
-- Dependencies: 218
-- Data for Name: banka; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

COPY sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) FROM stdin;
6	ERSTE &STEIERMÄRKISCHE BANK d.d. Rijeka	2402006	t	2023-09-02	0.00	0
5	CROATIA BANKA d.d. Zagreb	2485003	t	2023-09-02	0.02	1
3	BANKA KOVANICA d.d. Varaždin	4133006	t	2023-09-02	0.05	2
4	BKS BANK AG, Glavna podružnica Hrvatska	2488001	t	2023-09-02	0.06	3
10	IMEX BANKA d.d. Split	2492008	t	2023-09-02	0.09	4
2	AGRAM BANKA d.d. Zagreb	2481000	t	2023-09-02	0.10	5
21	ZAGREBAČKA BANKA d.d. Zagreb	2360000	t	2023-09-02	0.12	6
19	SAMOBORSKA BANKA d.d. Samobor	2403009	t	2023-09-02	0.15	7
17	PRIVREDNA BANKA ZAGREB d.d. Zagreb	2340009	t	2023-09-02	0.15	7
14	OTP BANKA d.d. Split	2407000	t	2023-09-02	0.16	8
12	KARLOVAČKA BANKA d.d. Karlovac	2400008	t	2023-09-02	0.18	9
13	KENTBANK d.d. Zagreb	4124003	t	2023-09-02	0.19	10
7	HRVATSKA BANKA ZA OBNOVU I RAZVITAK Zagreb	2493003	t	2023-09-02	0.20	11
9	HRVATSKA POŠTANSKA BANKA d.d. Zagreb1	2390001	t	2023-09-02	0.20	11
1	Addiko Bank d.d., Zagreb	2500009	t	2023-09-02	0.20	11
16	PODRAVSKA BANKA d.d. Koprivnica	2386002	t	2023-09-02	0.21	12
20	SLATINSKA BANKA d.d. Slatina	2412009	t	2023-09-02	0.22	13
18	RAIFFEISENBANK AUSTRIA d.d. Zagreb	2484008	t	2023-09-02	0.23	14
11	J&T banka d.d. Varaždin	2489004	t	2023-09-02	0.26	15
15	PARTNER BANKA d.d. Zagreb	2408002	t	2023-09-02	0.28	16
8	HRVATSKA NARODNA BANKA	1001005	t	2023-09-02	0.29	17
\.


--
-- TOC entry 3361 (class 0 OID 16466)
-- Dependencies: 220
-- Data for Name: grupa_naloga; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

COPY sepa_dev.grupa_naloga (id, id_user, iznos_grupe, sts_grupe, date) FROM stdin;
\.


--
-- TOC entry 3360 (class 0 OID 16449)
-- Dependencies: 219
-- Data for Name: nalog; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

COPY sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene) FROM stdin;
\.


--
-- TOC entry 3358 (class 0 OID 16415)
-- Dependencies: 217
-- Data for Name: racun; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

COPY sepa_dev.racun (id, drzava_rac, kontrolni_broj_rac, iban_rac, ime_rac, adresa_rac, mjesto_rac, sts_rac, date, vbdi_rac, id_banke) FROM stdin;
1	HR	81	10010057368566257	ImeVlasnikaHNB	AdresaVlasnikaHNB	MjestoVlasnikaHNB	t	2023-09-02	1001005	8
2	HR	23	24020061100525045	Veleučilište u Bjelovaru	Trg Eugena Kvaternika 4	43000 Bjelovar	t	2023-09-02	2402006	6
\.


--
-- TOC entry 3356 (class 0 OID 16408)
-- Dependencies: 215
-- Data for Name: users; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

COPY sepa_dev.users (id, ime, prezime, email, password, dob, lokacija, username, roles, br_blagajne) FROM stdin;
3	Test	testts	test@gmail.com	$2a$10$chimgxJIBjqDTEq9ZfSUJ.USw2lQFL9lZXmOh62VlGwbw0WRifNsO	0	lokacija	test	Guest	2
2	Pero	Perić	pperic@gmail.com	$2a$12$h.rR1jcRT6QcW4fp144COucsNBlRFTlPPPGp9VCbUO9x2NCpE5J2W	26	Virovitica	pperic22	Admin, Guest	1
\.


--
-- TOC entry 3362 (class 0 OID 16511)
-- Dependencies: 221
-- Data for Name: vrsta_namjene; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

COPY sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) FROM stdin;
1	CDCD	Gotovinska isplata Isplata gotovine na bankomatu ili na šalteru banke	2023-09-03
2	CDCB	Kartično plaćanje uz gotovinski povrat (Cashback) Kupovina roba i usluga uz dodatnu isplatu gotovine na prodajnom mjestu	2023-09-03
3	CDQC	Zamjenska gotovina Kupovina roba koje su jednake gotovini poput kupona u kockarnicama	2023-09-03
4	CDOC	Originalno odobrenje Transakcija koja omogućuje primatelju kartice izvršenje odobrenja u korist računa vlasnika kartice	2023-09-03
5	ACCT	Upravljanje sredstvima - unutar banke Transakcija prenošenja sredstava između dva računa istog vlasnika računa kod iste banke	2023-09-03
6	CASH	Upravljanje sredstvima – izvan banke Transakcija predstavlja opću instrukciju za upravljanje sredstvima	2023-09-03
7	COLL	Naplata Transakcija predstavlja prikupljanje sredstava temeljem priljeva na račun ili izravnog terećenja	2023-09-03
8	CSDB	Gotovinska isplata Transakcija se odnosi na gotovinsku isplatu	2023-09-03
9	DEPT	Depozit Transakcija se odnosi na uplatu depozita	2023-09-03
\.


--
-- TOC entry 3363 (class 0 OID 16514)
-- Dependencies: 222
-- Data for Name: vrsta_opisa_placanja; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

COPY sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) FROM stdin;
2	100	Osobno primanje isplaćeno u cijelosti	2023-09-04
3	110	Isplata dijela osobnog primanja – zaštićeni dio	2023-09-04
4	120	Osobno primanje umanjeno za zaštićeni dio	2023-09-04
5	130	Ugovor o djelu – zaštićeni dio	2023-09-04
6	140	Rad za vrijeme školovanja – zaštićeni dio	2023-09-04
7	150	Isplata dividende	2023-09-04
8	160	Naknada članova Upravnog vijeća, Skupština, Nadzornih odbora	2023-09-04
9	170	Primanja od iznajmljivanja turističkih kapaciteta	2023-09-04
10	180	Najam	2023-09-04
11	190	Prijevoz – zaštićeni dio	2023-09-04
12	191	Topli obrok, do propisanih iznosa do kojih se ne smatraju oporezivim primicima	2023-09-04
13	200	Službeni put – zaštićeni dio	2023-09-04
15	220	Naknada za odvojeni život	2023-09-04
16	230	Naknada za bolovanje	2023-09-04
14	210	Terenski dodatak – zaštićeni dio	2023-09-04
1	0	Proizvoljni unos opisa plaćanja	2023-09-05
\.


--
-- TOC entry 3371 (class 0 OID 0)
-- Dependencies: 216
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.users_id_seq', 14, true);


--
-- TOC entry 3202 (class 2606 OID 16419)
-- Name: racun Racun_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.racun
    ADD CONSTRAINT "Racun_pkey" PRIMARY KEY (id);


--
-- TOC entry 3204 (class 2606 OID 16448)
-- Name: banka banka_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.banka
    ADD CONSTRAINT banka_pkey PRIMARY KEY (id);


--
-- TOC entry 3208 (class 2606 OID 16470)
-- Name: grupa_naloga grupaNaloga_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.grupa_naloga
    ADD CONSTRAINT "grupaNaloga_pkey" PRIMARY KEY (id);


--
-- TOC entry 3206 (class 2606 OID 16455)
-- Name: nalog nalog_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.nalog
    ADD CONSTRAINT nalog_pkey PRIMARY KEY (id);


--
-- TOC entry 3200 (class 2606 OID 16414)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 3213 (class 2606 OID 16471)
-- Name: grupa_naloga grupaNaloga_idUser_fkey; Type: FK CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.grupa_naloga
    ADD CONSTRAINT "grupaNaloga_idUser_fkey" FOREIGN KEY (id_user) REFERENCES sepa_dev.users(id) NOT VALID;


--
-- TOC entry 3210 (class 2606 OID 16461)
-- Name: nalog idBanke; Type: FK CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.nalog
    ADD CONSTRAINT "idBanke" FOREIGN KEY (id_banke) REFERENCES sepa_dev.banka(id) NOT VALID;


--
-- TOC entry 3211 (class 2606 OID 16476)
-- Name: nalog idGrupeNaloga; Type: FK CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.nalog
    ADD CONSTRAINT "idGrupeNaloga" FOREIGN KEY (id_grupe_naloga) REFERENCES sepa_dev.grupa_naloga(id) NOT VALID;


--
-- TOC entry 3212 (class 2606 OID 16456)
-- Name: nalog idUser; Type: FK CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.nalog
    ADD CONSTRAINT "idUser" FOREIGN KEY (id_user) REFERENCES sepa_dev.users(id) NOT VALID;


--
-- TOC entry 3209 (class 2606 OID 16481)
-- Name: racun racun_idBanke_fkey; Type: FK CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.racun
    ADD CONSTRAINT "racun_idBanke_fkey" FOREIGN KEY (id_banke) REFERENCES sepa_dev.banka(id) NOT VALID;


-- Completed on 2023-09-05 21:58:30

--
-- PostgreSQL database dump complete
--

-- Completed on 2023-09-05 21:58:30

--
-- PostgreSQL database cluster dump complete
--

