--
-- PostgreSQL database cluster dump
--

-- Started on 2023-09-06 17:18:58

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Drop databases (except postgres and template1)
--

DROP DATABASE IF EXISTS sepa_database;




--
-- Drop roles
--

DROP ROLE IF EXISTS postgres;


--
-- Roles
--

CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:OiVXklxwGyUbYsf5kva4Rg==$vZIFwrNf1/82T4kLho8pjpyzG+zmWFr0cnark1rtYa0=:JJAy7p425KLdgRLswvX79nz+4GxzZyIrtUH0bBz3Wlw=';

--
-- User Configurations
--








--
-- Databases
--

--
-- Database "template1" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 15.4
-- Dumped by pg_dump version 15.4

-- Started on 2023-09-06 17:18:58

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

UPDATE pg_catalog.pg_database SET datistemplate = false WHERE datname = 'template1';
DROP DATABASE template1;
--
-- TOC entry 3315 (class 1262 OID 1)
-- Name: template1; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE template1 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Croatian_Croatia.1250';


ALTER DATABASE template1 OWNER TO postgres;

\connect template1

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
-- TOC entry 3316 (class 0 OID 0)
-- Dependencies: 3315
-- Name: DATABASE template1; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE template1 IS 'default template for new databases';


--
-- TOC entry 3318 (class 0 OID 0)
-- Name: template1; Type: DATABASE PROPERTIES; Schema: -; Owner: postgres
--

ALTER DATABASE template1 IS_TEMPLATE = true;


\connect template1

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
-- TOC entry 3317 (class 0 OID 0)
-- Dependencies: 3315
-- Name: DATABASE template1; Type: ACL; Schema: -; Owner: postgres
--

REVOKE CONNECT,TEMPORARY ON DATABASE template1 FROM PUBLIC;
GRANT CONNECT ON DATABASE template1 TO PUBLIC;


-- Completed on 2023-09-06 17:18:59

--
-- PostgreSQL database dump complete
--

--
-- Database "postgres" dump
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 15.4
-- Dumped by pg_dump version 15.4

-- Started on 2023-09-06 17:18:59

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

DROP DATABASE postgres;
--
-- TOC entry 3316 (class 1262 OID 5)
-- Name: postgres; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Croatian_Croatia.1250';


ALTER DATABASE postgres OWNER TO postgres;

\connect postgres

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
-- TOC entry 3317 (class 0 OID 0)
-- Dependencies: 3316
-- Name: DATABASE postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- TOC entry 2 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 3318 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


-- Completed on 2023-09-06 17:19:00

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
-- Dumped by pg_dump version 15.4

-- Started on 2023-09-06 17:19:00

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
-- TOC entry 3386 (class 1262 OID 16398)
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
-- TOC entry 6 (class 2615 OID 16399)
-- Name: sepa_dev; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA sepa_dev;


ALTER SCHEMA sepa_dev OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 16448)
-- Name: banka; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.banka (
    id integer NOT NULL,
    ime_banke text NOT NULL,
    vbdi_banke text NOT NULL,
    sts_banke boolean NOT NULL,
    date date NOT NULL,
    iznos_naknade numeric(10,2) NOT NULL,
    vrsta_naknade integer NOT NULL
);


ALTER TABLE sepa_dev.banka OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16447)
-- Name: banka_id_seq; Type: SEQUENCE; Schema: sepa_dev; Owner: postgres
--

CREATE SEQUENCE sepa_dev.banka_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sepa_dev.banka_id_seq OWNER TO postgres;

--
-- TOC entry 3387 (class 0 OID 0)
-- Dependencies: 217
-- Name: banka_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.banka_id_seq OWNED BY sepa_dev.banka.id;


--
-- TOC entry 220 (class 1259 OID 16457)
-- Name: grupa_naloga; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.grupa_naloga (
    id integer NOT NULL,
    id_user integer NOT NULL,
    sts_grupe character varying(40) NOT NULL,
    date character varying(40)
);


ALTER TABLE sepa_dev.grupa_naloga OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16456)
-- Name: grupa_naloga_id_seq; Type: SEQUENCE; Schema: sepa_dev; Owner: postgres
--

CREATE SEQUENCE sepa_dev.grupa_naloga_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sepa_dev.grupa_naloga_id_seq OWNER TO postgres;

--
-- TOC entry 3388 (class 0 OID 0)
-- Dependencies: 219
-- Name: grupa_naloga_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.grupa_naloga_id_seq OWNED BY sepa_dev.grupa_naloga.id;


--
-- TOC entry 222 (class 1259 OID 16465)
-- Name: nalog; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.nalog (
    id integer NOT NULL,
    id_grupe_naloga integer NOT NULL,
    id_user integer NOT NULL,
    id_banke integer NOT NULL,
    tip_naloga character varying(40),
    valuta_placanja character varying(3),
    iznos numeric(10,2) NOT NULL,
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
    iznos_naknade numeric(10,2),
    sif_namjene character varying(5),
    sts_naloga character varying(40)
);


ALTER TABLE sepa_dev.nalog OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16464)
-- Name: nalog_id_seq; Type: SEQUENCE; Schema: sepa_dev; Owner: postgres
--

CREATE SEQUENCE sepa_dev.nalog_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sepa_dev.nalog_id_seq OWNER TO postgres;

--
-- TOC entry 3389 (class 0 OID 0)
-- Dependencies: 221
-- Name: nalog_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.nalog_id_seq OWNED BY sepa_dev.nalog.id;


--
-- TOC entry 224 (class 1259 OID 16474)
-- Name: racun; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.racun (
    id integer NOT NULL,
    drzava_rac character varying(2) NOT NULL,
    kontrolni_broj_rac character varying(2) NOT NULL,
    iban_rac character varying(40) NOT NULL,
    ime_rac character varying(40),
    adresa_rac character varying(80),
    mjesto_rac character varying(40),
    sts_rac character(1) NOT NULL,
    date date NOT NULL,
    vbdi_rac integer NOT NULL,
    id_banke integer NOT NULL
);


ALTER TABLE sepa_dev.racun OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16473)
-- Name: racun_id_seq; Type: SEQUENCE; Schema: sepa_dev; Owner: postgres
--

CREATE SEQUENCE sepa_dev.racun_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sepa_dev.racun_id_seq OWNER TO postgres;

--
-- TOC entry 3390 (class 0 OID 0)
-- Dependencies: 223
-- Name: racun_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.racun_id_seq OWNED BY sepa_dev.racun.id;


--
-- TOC entry 216 (class 1259 OID 16430)
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
-- TOC entry 215 (class 1259 OID 16429)
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
-- TOC entry 3391 (class 0 OID 0)
-- Dependencies: 215
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.users_id_seq OWNED BY sepa_dev.users.id;


--
-- TOC entry 226 (class 1259 OID 16481)
-- Name: vrsta_namjene; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.vrsta_namjene (
    id integer NOT NULL,
    sif_namjene character varying(10) NOT NULL,
    opis text NOT NULL,
    date date NOT NULL
);


ALTER TABLE sepa_dev.vrsta_namjene OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16480)
-- Name: vrsta_namjene_id_seq; Type: SEQUENCE; Schema: sepa_dev; Owner: postgres
--

CREATE SEQUENCE sepa_dev.vrsta_namjene_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sepa_dev.vrsta_namjene_id_seq OWNER TO postgres;

--
-- TOC entry 3392 (class 0 OID 0)
-- Dependencies: 225
-- Name: vrsta_namjene_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.vrsta_namjene_id_seq OWNED BY sepa_dev.vrsta_namjene.id;


--
-- TOC entry 228 (class 1259 OID 16490)
-- Name: vrsta_opisa_placanja; Type: TABLE; Schema: sepa_dev; Owner: postgres
--

CREATE TABLE sepa_dev.vrsta_opisa_placanja (
    id integer NOT NULL,
    sif_opis_plac integer NOT NULL,
    opis text NOT NULL,
    date date NOT NULL
);


ALTER TABLE sepa_dev.vrsta_opisa_placanja OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 16489)
-- Name: vrsta_opisa_placanja_id_seq; Type: SEQUENCE; Schema: sepa_dev; Owner: postgres
--

CREATE SEQUENCE sepa_dev.vrsta_opisa_placanja_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sepa_dev.vrsta_opisa_placanja_id_seq OWNER TO postgres;

--
-- TOC entry 3393 (class 0 OID 0)
-- Dependencies: 227
-- Name: vrsta_opisa_placanja_id_seq; Type: SEQUENCE OWNED BY; Schema: sepa_dev; Owner: postgres
--

ALTER SEQUENCE sepa_dev.vrsta_opisa_placanja_id_seq OWNED BY sepa_dev.vrsta_opisa_placanja.id;


--
-- TOC entry 3205 (class 2604 OID 16451)
-- Name: banka id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.banka ALTER COLUMN id SET DEFAULT nextval('sepa_dev.banka_id_seq'::regclass);


--
-- TOC entry 3206 (class 2604 OID 16460)
-- Name: grupa_naloga id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.grupa_naloga ALTER COLUMN id SET DEFAULT nextval('sepa_dev.grupa_naloga_id_seq'::regclass);


--
-- TOC entry 3207 (class 2604 OID 16468)
-- Name: nalog id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.nalog ALTER COLUMN id SET DEFAULT nextval('sepa_dev.nalog_id_seq'::regclass);


--
-- TOC entry 3208 (class 2604 OID 16477)
-- Name: racun id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.racun ALTER COLUMN id SET DEFAULT nextval('sepa_dev.racun_id_seq'::regclass);


--
-- TOC entry 3204 (class 2604 OID 16438)
-- Name: users id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.users ALTER COLUMN id SET DEFAULT nextval('sepa_dev.users_id_seq'::regclass);


--
-- TOC entry 3209 (class 2604 OID 16484)
-- Name: vrsta_namjene id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.vrsta_namjene ALTER COLUMN id SET DEFAULT nextval('sepa_dev.vrsta_namjene_id_seq'::regclass);


--
-- TOC entry 3210 (class 2604 OID 16493)
-- Name: vrsta_opisa_placanja id; Type: DEFAULT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.vrsta_opisa_placanja ALTER COLUMN id SET DEFAULT nextval('sepa_dev.vrsta_opisa_placanja_id_seq'::regclass);


--
-- TOC entry 3370 (class 0 OID 16448)
-- Dependencies: 218
-- Data for Name: banka; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (6, 'ERSTE &STEIERMÄRKISCHE BANK d.d. Rijeka', '2402006', true, '2023-09-02', 0.00, 0) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (5, 'CROATIA BANKA d.d. Zagreb', '2485003', true, '2023-09-02', 0.02, 1) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (3, 'BANKA KOVANICA d.d. Varaždin', '4133006', true, '2023-09-02', 0.05, 2) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (4, 'BKS BANK AG, Glavna podružnica Hrvatska', '2488001', true, '2023-09-02', 0.06, 3) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (10, 'IMEX BANKA d.d. Split', '2492008', true, '2023-09-02', 0.09, 4) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (2, 'AGRAM BANKA d.d. Zagreb', '2481000', true, '2023-09-02', 0.10, 5) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (21, 'ZAGREBAČKA BANKA d.d. Zagreb', '2360000', true, '2023-09-02', 0.12, 6) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (19, 'SAMOBORSKA BANKA d.d. Samobor', '2403009', true, '2023-09-02', 0.15, 7) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (17, 'PRIVREDNA BANKA ZAGREB d.d. Zagreb', '2340009', true, '2023-09-02', 0.15, 7) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (14, 'OTP BANKA d.d. Split', '2407000', true, '2023-09-02', 0.16, 8) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (12, 'KARLOVAČKA BANKA d.d. Karlovac', '2400008', true, '2023-09-02', 0.18, 9) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (13, 'KENTBANK d.d. Zagreb', '4124003', true, '2023-09-02', 0.19, 10) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (7, 'HRVATSKA BANKA ZA OBNOVU I RAZVITAK Zagreb', '2493003', true, '2023-09-02', 0.20, 11) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (9, 'HRVATSKA POŠTANSKA BANKA d.d. Zagreb1', '2390001', true, '2023-09-02', 0.20, 11) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (1, 'Addiko Bank d.d., Zagreb', '2500009', true, '2023-09-02', 0.20, 11) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (16, 'PODRAVSKA BANKA d.d. Koprivnica', '2386002', true, '2023-09-02', 0.21, 12) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (20, 'SLATINSKA BANKA d.d. Slatina', '2412009', true, '2023-09-02', 0.22, 13) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (18, 'RAIFFEISENBANK AUSTRIA d.d. Zagreb', '2484008', true, '2023-09-02', 0.23, 14) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (11, 'J&T banka d.d. Varaždin', '2489004', true, '2023-09-02', 0.26, 15) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (15, 'PARTNER BANKA d.d. Zagreb', '2408002', true, '2023-09-02', 0.28, 16) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.banka (id, ime_banke, vbdi_banke, sts_banke, date, iznos_naknade, vrsta_naknade) VALUES (8, 'HRVATSKA NARODNA BANKA', '1001005', true, '2023-09-02', 0.29, 17) ON CONFLICT DO NOTHING;


--
-- TOC entry 3372 (class 0 OID 16457)
-- Dependencies: 220
-- Data for Name: grupa_naloga; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (8, 1, 'true', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (9, 1, 'true', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (10, 1, 'true', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (11, 1, 'true', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (12, 1, 'true', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (13, 1, 'true', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (14, 1, 'true', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (15, 1, 'Aktivan', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (16, 1, 'Aktivan', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (17, 1, 'Aktivan', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (18, 1, 'Aktivan', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (19, 1, 'Aktivan', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (20, 1, 'Aktivan', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (21, 1, 'Aktivan', '2023-09-06') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (22, 1, 'Aktivan', '2023-09-06') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.grupa_naloga (id, id_user, sts_grupe, date) VALUES (23, 1, 'Aktivan', '2023-09-06') ON CONFLICT DO NOTHING;


--
-- TOC entry 3374 (class 0 OID 16465)
-- Dependencies: 222
-- Data for Name: nalog; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (3, 12, 1, 8, NULL, NULL, 22.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 190, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Prijevoz – zaštićeni dio', 2, 17, 0.29, 'CDOC', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (4, 13, 1, 8, 'Uplata', 'EUR', 22.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 140, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Rad za vrijeme školovanja – zaštićeni dio', 2, 17, 0.29, 'CDOC', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (5, 14, 1, 8, 'Uplata', 'EUR', 150.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 100, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Osobno primanje isplaćeno u cijelosti', 2, 17, 0.29, 'CDCD', NULL) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (6, 15, 1, 8, 'Uplata', 'EUR', 150.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 100, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Osobno primanje isplaćeno u cijelosti', 2, 17, 0.29, 'CDCD', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (7, 16, 1, 8, 'Uplata', 'EUR', 1.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 140, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Rad za vrijeme školovanja – zaštićeni dio', 2, 17, 0.29, 'CDCD', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (8, 17, 1, 8, 'Uplata', 'EUR', 121.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 180, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Najam', 2, 17, 0.29, 'CDCD', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (9, 18, 1, 8, 'Uplata', 'EUR', 10.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 150, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Isplata dividende', 2, 17, 0.29, '', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (10, 19, 1, 8, 'Uplata', 'EUR', 16.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 140, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Rad za vrijeme školovanja – zaštićeni dio', 2, 17, 0.29, '', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (11, 20, 1, 8, 'Uplata', 'EUR', 10.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 180, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Najam', 2, 17, 0.29, 'CDQC', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (12, 21, 1, 8, 'Uplata', 'EUR', 10.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 130, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Ugovor o djelu – zaštićeni dio', 2, 17, 0.29, 'CDCB', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (13, 22, 1, 8, 'Uplata', 'EUR', 40.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 100, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Osobno primanje isplaćeno u cijelosti', 2, 17, 0.29, 'CDCD', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (14, 23, 1, 8, 'Uplata', 'EUR', 80.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 180, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Najam', 2, 17, 0.29, 'CDCD', 'Aktivan') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.nalog (id, id_grupe_naloga, id_user, id_banke, tip_naloga, valuta_placanja, iznos, ime_plat, adresa_plat, mjesto_plat, ime_prim, adresa_prim, mjesto_prim, sif_opis_plac, dat_izvrsenja, dat_podnosenja, drzava_plat, kontrolni_broj_plat, iban_plat, model_plat, pnb_plat, drzava_prim, kontrolni_broj_prim, iban_prim, model_prim, pnb_prim, opis_plac, br_blagajne, vr_naknade, iznos_naknade, sif_namjene, sts_naloga) VALUES (15, 23, 1, 8, 'Uplata', 'EUR', 70.00, 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 100, '2023-09-06', '2023-09-06', 'HR', '81', '10010057368566257', '99', '', 'HR', '23', '24020061100525045', '99', '', 'Osobno primanje isplaćeno u cijelosti', 2, 17, 0.29, 'CDCD', 'Aktivan') ON CONFLICT DO NOTHING;


--
-- TOC entry 3376 (class 0 OID 16474)
-- Dependencies: 224
-- Data for Name: racun; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

INSERT INTO sepa_dev.racun (id, drzava_rac, kontrolni_broj_rac, iban_rac, ime_rac, adresa_rac, mjesto_rac, sts_rac, date, vbdi_rac, id_banke) VALUES (1, 'HR', '81', '10010057368566257', 'ImeVlasnikaHNB', 'AdresaVlasnikaHNB', 'MjestoVlasnikaHNB', 't', '2023-09-02', 1001005, 8) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.racun (id, drzava_rac, kontrolni_broj_rac, iban_rac, ime_rac, adresa_rac, mjesto_rac, sts_rac, date, vbdi_rac, id_banke) VALUES (2, 'HR', '23', '24020061100525045', 'Veleučilište u Bjelovaru', 'Trg Eugena Kvaternika 4', '43000 Bjelovar', 't', '2023-09-02', 2402006, 6) ON CONFLICT DO NOTHING;


--
-- TOC entry 3368 (class 0 OID 16430)
-- Dependencies: 216
-- Data for Name: users; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

INSERT INTO sepa_dev.users (id, ime, prezime, email, password, dob, lokacija, username, roles, br_blagajne) VALUES (2, 'ime', 'prezime', 'iprezime@gmail.com', '$2a$10$dIAHpZgQNANK2M3nQGPyy.GJgZ4L8Px9bmoYYuXQv07rK/KJ8KFTC', 0, 'lokacija', 'korisnik', 'Guest', 1) ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.users (id, ime, prezime, email, password, dob, lokacija, username, roles, br_blagajne) VALUES (1, 'Pero', 'Perić', 'pperic@gmail.com', '$2a$12$h.rR1jcRT6QcW4fp144COucsNBlRFTlPPPGp9VCbUO9x2NCpE5J2W', 24, 'Virovitica', 'pperic22', 'Admin, Guest', 2) ON CONFLICT DO NOTHING;


--
-- TOC entry 3378 (class 0 OID 16481)
-- Dependencies: 226
-- Data for Name: vrsta_namjene; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (1, 'CDCD', 'Gotovinska isplata Isplata gotovine na bankomatu ili na šalteru banke', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (2, 'CDCB', 'Kartično plaćanje uz gotovinski povrat (Cashback) Kupovina roba i usluga uz dodatnu isplatu gotovine na prodajnom mjestu', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (3, 'CDQC', 'Zamjenska gotovina Kupovina roba koje su jednake gotovini poput kupona u kockarnicama', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (4, 'CDOC', 'Originalno odobrenje Transakcija koja omogućuje primatelju kartice izvršenje odobrenja u korist računa vlasnika kartice', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (5, 'ACCT', 'Upravljanje sredstvima - unutar banke Transakcija prenošenja sredstava između dva računa istog vlasnika računa kod iste banke', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (6, 'CASH', 'Upravljanje sredstvima – izvan banke Transakcija predstavlja opću instrukciju za upravljanje sredstvima', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (7, 'COLL', 'Naplata Transakcija predstavlja prikupljanje sredstava temeljem priljeva na račun ili izravnog terećenja', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (8, 'CSDB', 'Gotovinska isplata Transakcija se odnosi na gotovinsku isplatu', '2023-09-03') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_namjene (id, sif_namjene, opis, date) VALUES (9, 'DEPT', 'Depozit Transakcija se odnosi na uplatu depozita', '2023-09-03') ON CONFLICT DO NOTHING;


--
-- TOC entry 3380 (class 0 OID 16490)
-- Dependencies: 228
-- Data for Name: vrsta_opisa_placanja; Type: TABLE DATA; Schema: sepa_dev; Owner: postgres
--

INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (1, 100, 'Osobno primanje isplaćeno u cijelosti', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (2, 110, 'Isplata dijela osobnog primanja – zaštićeni dio', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (3, 120, 'Osobno primanje umanjeno za zaštićeni dio', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (4, 130, 'Ugovor o djelu – zaštićeni dio', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (5, 140, 'Rad za vrijeme školovanja – zaštićeni dio', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (6, 150, 'Isplata dividende', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (7, 160, 'Naknada članova Upravnog vijeća, Skupština, Nadzornih odbora', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (8, 170, 'Primanja od iznajmljivanja turističkih kapaciteta', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (9, 180, 'Najam', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (10, 190, 'Prijevoz – zaštićeni dio', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (11, 191, 'Topli obrok, do propisanih iznosa do kojih se ne smatraju oporezivim primicima', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (12, 200, 'Službeni put – zaštićeni dio', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (13, 220, 'Naknada za odvojeni život', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (14, 230, 'Naknada za bolovanje', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (15, 210, 'Terenski dodatak – zaštićeni dio', '2023-09-04') ON CONFLICT DO NOTHING;
INSERT INTO sepa_dev.vrsta_opisa_placanja (id, sif_opis_plac, opis, date) VALUES (16, 0, 'Proizvoljni unos opisa plaćanja', '2023-09-05') ON CONFLICT DO NOTHING;


--
-- TOC entry 3394 (class 0 OID 0)
-- Dependencies: 217
-- Name: banka_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.banka_id_seq', 1, false);


--
-- TOC entry 3395 (class 0 OID 0)
-- Dependencies: 219
-- Name: grupa_naloga_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.grupa_naloga_id_seq', 23, true);


--
-- TOC entry 3396 (class 0 OID 0)
-- Dependencies: 221
-- Name: nalog_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.nalog_id_seq', 15, true);


--
-- TOC entry 3397 (class 0 OID 0)
-- Dependencies: 223
-- Name: racun_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.racun_id_seq', 1, false);


--
-- TOC entry 3398 (class 0 OID 0)
-- Dependencies: 215
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.users_id_seq', 2, true);


--
-- TOC entry 3399 (class 0 OID 0)
-- Dependencies: 225
-- Name: vrsta_namjene_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.vrsta_namjene_id_seq', 9, true);


--
-- TOC entry 3400 (class 0 OID 0)
-- Dependencies: 227
-- Name: vrsta_opisa_placanja_id_seq; Type: SEQUENCE SET; Schema: sepa_dev; Owner: postgres
--

SELECT pg_catalog.setval('sepa_dev.vrsta_opisa_placanja_id_seq', 16, true);


--
-- TOC entry 3214 (class 2606 OID 16455)
-- Name: banka banka_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.banka
    ADD CONSTRAINT banka_pkey PRIMARY KEY (id);


--
-- TOC entry 3216 (class 2606 OID 16462)
-- Name: grupa_naloga grupa_naloga_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.grupa_naloga
    ADD CONSTRAINT grupa_naloga_pkey PRIMARY KEY (id);


--
-- TOC entry 3218 (class 2606 OID 16472)
-- Name: nalog nalog_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.nalog
    ADD CONSTRAINT nalog_pkey PRIMARY KEY (id);


--
-- TOC entry 3220 (class 2606 OID 16479)
-- Name: racun racun_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.racun
    ADD CONSTRAINT racun_pkey PRIMARY KEY (id);


--
-- TOC entry 3212 (class 2606 OID 16440)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 3222 (class 2606 OID 16488)
-- Name: vrsta_namjene vrsta_namjene_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.vrsta_namjene
    ADD CONSTRAINT vrsta_namjene_pkey PRIMARY KEY (id);


--
-- TOC entry 3224 (class 2606 OID 16497)
-- Name: vrsta_opisa_placanja vrsta_opisa_placanja_pkey; Type: CONSTRAINT; Schema: sepa_dev; Owner: postgres
--

ALTER TABLE ONLY sepa_dev.vrsta_opisa_placanja
    ADD CONSTRAINT vrsta_opisa_placanja_pkey PRIMARY KEY (id);


-- Completed on 2023-09-06 17:19:00

--
-- PostgreSQL database dump complete
--

-- Completed on 2023-09-06 17:19:00

--
-- PostgreSQL database cluster dump complete
--

