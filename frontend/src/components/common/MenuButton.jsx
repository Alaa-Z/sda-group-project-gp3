import "../../css/animation/menu-button.css";

export default function MenuButton() {
  return (
    <svg
      class="menu"
      ontouchstart=""
      width="25px"
      height="25px"
      viewBox="0 0 500 500"
    >
      <path
        class="border1 border"
        d="M44.6,151.6h409.9c18.9,0,34.2-15.2,34.2-34.1c0-18.8-15.3-34-34.2-34H44.6c-18.8,0-34.1,15.2-34.1,34 C10.4,136.4,25.7,151.6,44.6,151.6z"
      />
      <path
        class="border2 border"
        d="M454.5,219.9H44.5c-18.8,0-34.1,15.3-34.1,34.1c0,18.9,15.3,34.2,34.1,34.2h409.9c18.9,0,34.2-15.3,34.2-34.2 C488.7,235.2,473.3,219.9,454.5,219.9z"
      />
      <path
        class="border3 border"
        d="M454.5,356.7H44.5c-18.8,0-34.1,15.2-34.1,34.1c0,18.8,15.3,34.1,34.1,34.1h409.9c18.9,0,34.2-15.3,34.2-34.1 S473.3,356.7,454.5,356.7z"
      />
    </svg>
  );
}
